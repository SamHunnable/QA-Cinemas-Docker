# QA Cinemas Application

For a fresh install run:

~~~
@"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command "iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"
~~~

This installs chocolatey which is a package manager which will handle everything for you.
Next ensure the JDK, Maven and VirtualBox are installed.

~~~
choco install -y jdk8 maven virtualbox
choco install -y docker-toolbox -ia /TASKS="desktopicon,modifypath,upgradevm"
~~~

This installs all 3 and then creates a new virtual machine for us to host docker on.

Open VirtualBox and select the machine. Open Settings/Network/Advanced/Port Forwarding. Create a new rule and make the host port and guest port 8080.

You may need to clone the project if you have not already done so. Double check which branch you are on.

Open a docker terminal. You should see a whale when it opens - do not use a regular command window.

Run the following from the directory that contains the POM file:

~~~
mvn clean package docker:build
~~~

Then run:

~~~
docker run --name qacinemas-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=qacinemas -e MYSQL_USER=user -e MYSQL_PASSWORD=pass -d mysql:5.6

docker run -p 8080:8080 --name qa-cinemas --link qacinemas-mysql:mysql -d qacinemas/qa-cinemas
~~~

To see all containers including ones that have exited:

~~~
docker ps -a
~~~

If there is an error you can check the logs by running the relevant line:

~~~
docker logs qacinemas-mysql

docker logs qa-cinemas
~~~

In order to reset you will need to close and remove all containers:

~~~
docker stop $(docker ps -aq)
docker rm $(docker ps -aq)
~~~

Make sure to do a fresh build to get a new image with any changes you have made.

FRONTEND

You should have NodeJS installed as well as Angular. If you have NodeJS but not Angular you can install it from the command line using:

~~~
npm install -g @angular/cli
~~~

You will need the node_modules folder in client and you may need to copy this across from a different Angular project as it is not in the repository.


Open a command terminal in the client folder and run:

~~~
ng serve
~~~

You may get an rxjs error. This is a backwards compatibility error that may be fixed later. To resolve it run:

~~~
npm install rxjs-compat --save
~~~