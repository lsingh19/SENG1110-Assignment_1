git add .
@echo off
REM variables must be in caps
set /p CHANGE=Please enter commit message?
@echo on
git commit -a -m "%CHANGE%"
pause
git push origin master
pause


