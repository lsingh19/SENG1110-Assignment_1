git add -u
git reset -- main/dontcheckmein.txt
Pause
@echo off
REM variables must be in caps
set /p CHANGE=Please enter commit message?
@echo on
git commit -a -m "%CHANGE%"
Pause
git push origin master


