import subprocess
import time
import datetime


print ("Starting scheduledRun")
timeToRun = "07:00:00"

while True:
    
    t = time.localtime()
    current_time = time.strftime("%H:%M:%S")
    
    if timeToRun == current_time and (datetime.datetime.today().weekday()) != 5 and (datetime.datetime.today().weekday()) != 6 :
        subprocess.call(['java', '-jar', 'autoScreening.jar'])
        time.sleep(1500)
        



