#!/bin/bash
cd "$(dirname "$0")"
echo `pwd`
cat exclusions > exclusions_maven.txt
