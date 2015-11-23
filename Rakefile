task :default do
  sh 'rake -T'
end

desc 'open index.html'
task :index do
  sh 'sbt fullOptJS'
  sh 'xdg-open index.html'
end
