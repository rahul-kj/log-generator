---
title: Simple spring-boot Log Generator Application
---

Use this application to generate logs in the PCF environment

`git clone https://github.com/rahul-kj/log-generator.git`
`mvn clean install`
`cf push`

Sample output:

```
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID c7410058-b721-4ee1-9ab4-5a4fd114a1a0 generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID 42846857-2dc3-4c28-8e10-9294c70bda0d generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID 97d0eff4-91dc-457e-bc4f-8f859b668908 generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID e6d6ca34-1f47-4bfa-9797-9cf3a268780e generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID 041fc3c5-4df4-4cf0-8abb-3abb0c6794d3 generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID 7a8b0022-ed74-4659-b5ec-7079dd07abd9 generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID 9a34157d-3dea-4098-8ca4-964cd6ed2281 generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID 3f46f065-3bb4-4b50-b531-4c788c148ef2 generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID 38cfa3cd-6d6a-4f07-9231-132536152bd4 generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID 68978ae2-2a29-4677-8094-c7d014f163c2 generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID 96a13869-c9e6-4a54-9d95-ddf6098c80a8 generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID 9c76449c-6a6a-46ac-8a44-87f082ab6bfa generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID 342cc4ad-edfb-47b2-ac77-6aeb804abdc4 generated at Wed Jun 29 19:06:18 UTC 2016
2016-06-29T14:06:18.26-0500 [APP/0]      OUT AUDIT Event - ID 491ffe06-ca9d-4ef4-b683-7f948963b08a generated at Wed Jun 29 19:06:18 UTC 2016
```