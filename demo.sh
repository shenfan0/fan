start.sh

#0、check user
TIME_STAMP=`date +%Y%m%d%H%M`
WHO=`whoami`
if [ "$WHO" != 'www' ]; then
        echo 'current user is not www'
        echo 'exit'
        exit
fi
CODE_HOME=/home/www/app
PROJECTNAME=qrealtime
cd $CODE_HOME/$PROJECTNAME
git pull
mvn clean package
pid=`ps -ef |grep $PROJECTNAME |grep -v "grep" |awk '{print $2}' ` 
if [ $pid != "" ]; then
        echo "App  is  running  and pid=$pid"
else
        echo "App is not  running."
fi


***********************************************************
stop.sh

#0、check user
TIME_STAMP=`date +%Y%m%d%H%M`
WHO=`whoami`
if [ "$WHO" != 'www' ]; then
     echo 'current user is not www'
     echo 'exit'
     exit
fi
CODE_HOME=/home/www/app
PROJECTNAME=qrealtime
cd $CODE_HOME/$PROJECTNAME
pid=`ps -ef |grep $PROJECTNAME |grep -v "grep" |awk '{print $2}'` 
if [ $pid ]; then
    echo "App  is  running  and pid=$pid"
else
   nohup java -jar $CODE_HOME/$PROJECTNAME/target/$<span style="font-family: 'microsoft yahei';">PROJECTNAME</span><span style="font-family: 'microsoft yahei';">-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 &</span>
fi


***********************************************************
restart

#0、check user
TIME_STAMP=`date +%Y%m%d%H%M`
WHO=`whoami`
if [ "$WHO" != 'www' ]; then
        echo 'current user is not www'
        echo 'exit'
        exit
fi
CODE_HOME=/home/www/app
PROJECTNAME=qrealtime
cd $CODE_HOME/$PROJECTNAME
pid=`ps -ef |grep $PROJECTNAME |grep -v "grep" |awk '{print $2}' ` 
if [ $pid ]; then
    echo "App  is  running  and pid=$pid"
    kill -9 $pid
    if [[ $? -eq 0 ]];then 
       echo "sucess to stop $PROJECTNAME " 
    else 
       echo "fail to stop $PROJECTNAME "
     fi
fi
***********************************************************

#0、check user
TIME_STAMP=`date +%Y%m%d%H%M`
WHO=`whoami`
if [ "$WHO" != 'www' ]; then
        echo 'current user is not www'
        echo 'exit'
        exit
fi
CODE_HOME=/home/www/app
PROJECTNAME=qrealtime
cd $CODE_HOME/$PROJECTNAME
pid=`ps -ef |grep $PROJECTNAME |grep -v "grep" |awk '{print $2}' ` 
if [ $pid ]; then
    echo "App  is  running  and pid=$pid"
    kill -9 $pid
fi
nohup java -jar $CODE_HOME/$PROJECTNAME/target/$PROJECTNAME-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 &