//writer = new FileWriter('output.txt')
//writer.write('a')

new FileWriter('output.txt').withWriter {write -> write.write('a')}

