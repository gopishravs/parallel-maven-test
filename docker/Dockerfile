FROM ubuntu:trusty

MAINTAINER Avner Hartuv

RUN apt-get update && \
    apt-get -y upgrade && \
    apt-get install -y git && \
    apt-get install -y software-properties-common

RUN apt-get install -y maven && \
    apt-get clean all && \
    rm -rf /var/lib/apt/* && \
    rm -rf /var/lib/cache/* && \
    rm -rf /var/lib/log/* && \
    rm -rf /tmp/*

RUN add-apt-repository ppa:openjdk-r/ppa && \
    apt-get update && \
    apt-get install -y openjdk-8-jdk

RUN rm -f /etc/alternatives/java && ln -s /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java /etc/alternatives/java

ENV HOME /data/jenkins
RUN groupadd -g 1000 jenkins
RUN useradd -g 1000 -u 1000 -d $HOME jenkins

RUN mkdir -p $HOME/tools
RUN chown -R 1000:1000 $HOME

USER jenkins
