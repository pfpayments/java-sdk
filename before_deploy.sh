#!/usr/bin/env bash

if [ -z "${TRAVIS_TAG}" ]; 
then
	echo "[INFO] This is not tagged build. The TRAVIS_TAG is not set. Skipping before_deploy step.";

else
	echo "[INFO] Running before_deploy script. Decrypting 'codesigning.asc.enc'..."
    openssl aes-256-cbc -K $encrypted_81c98acad902_key -iv $encrypted_81c98acad902_iv -in codesigning.asc.enc -out codesigning.asc -d && \
	gpg --fast-import codesigning.asc;
fi