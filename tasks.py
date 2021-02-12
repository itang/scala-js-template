from invoke import task


@task
def index(c):
    """sbt fullOptJS::webpack"""
    c.run('sbt fullOptJS::webpack')
    c.run('x-www-browser index.html')


@task
def index_fastopt(c):
    """sbt fastOptJS::webpack"""
    c.run('sbt fastOptJS::webpack')
    c.run('x-www-browser index-fastopt.html')


@task(default=True)
def usage(c):
    """Usage"""

    c.run('invoke -l')
