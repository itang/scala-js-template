task :default do
  sh 'rake -T'
end

desc 'open index.html'
task :index do
  sh 'sbt fullOptJS::webpack'
  sh 'x-www-browser index.html'
end

desc 'open index-fastopt.html'
task :index do
  sh 'sbt fastOptJS::webpack'
  sh 'x-www-browser index-fastopt.html'
end
