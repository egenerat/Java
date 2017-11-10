# Java 9

Release date: 21 September 2017

[Release notes](http://www.oracle.com/technetwork/java/javase/9all-relnotes-3704433.html)


## Install
On Ubuntu

`sudo apt install openjdk-9-jdk`

In case of error
```
dpkg: error processing archive /var/cache/apt/archives/openjdk-9-jdk_9~b114-0ubuntu1_amd64.deb (--unpack):
 trying to overwrite '/usr/lib/jvm/java-9-openjdk-amd64/include/linux/jawt_md.h', which is also in package openjdk-9-jdk-headless:amd64 9~b114-0ubuntu1
```

Use the command

`sudo apt -o Dpkg::Options::="--force-overwrite" install openjdk-9-jdk`
