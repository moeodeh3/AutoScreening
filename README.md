# AutoScreening

## Overview
A project that automated COVID screening procedures for my high school, which then I provided to fellow students. This project was created using Eclipse and optimized to run on a Raspberry Pi. To initiate the process, a Python script launches the Java-based Selenium program every weekday at 7:00 am. The need for this separate Python script came from the Raspberry Pi's crontab, which exclusively supports Command Line Interface (CLI) programs for auto-launch on startup. As a solution, I leveraged the crontab to launch the Python script, which, in turn, activates the Selenium program to conduct the screenings.


**Note**: This project was completed over two years ago and does not fully represent my current skills and abilities.
