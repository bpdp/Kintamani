Kintamani
=========

Welcome to Kintamani project. This project is meant to create a Pragmatic Web framework. It is the result of author's dissertation. As the dissertation is still in progress, in the meantime this framework is **very much unstable** and there's no documentation. This will surely be completed as time goes by.

The Software
============

This is just an initial attempt to integrate [Prova](http://prova.ws) into Vert.x. The software is in ``mods`` directory. It is developed as [Vert.x](http://vertx.io) module. In the meantime, it is now ``Runnable`` and can be executed using these steps:

* get all jars (Prova and Vert.x). I've prepare everything in ``mods/name.bpdp~kintamani~0.0.1/build.gradle``, so cd into that dir and then: 
	* gradle compileJava
	* gradle copyToLib => needs only to be executed once, to copy all jar into lib (needed to run module)
* cd to original dir (parent of mods)
* vertx runmod name.bpdp~kintamani~0.0.1
* access ``http://localhost:8080/rulesinaction``	

License
-------
~~~
Copyright 2013, Bambang Purnomosidi D. P.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
~~~

Author
------
The author ([Bambang Purnomosidi D. P.](http://bpdp.name)) is Ph.D candidate in [Electrical Engineering and Information Technology](http://pasca.te.ugm.ac.id), [Faculty of Engineering](http://www.fakultas-teknik.ugm.ac.id), [Gadjah Mada University](http://www.ugm.ac.id). He can be contacted by:
* Email: bambangpdp-with-domain-name-yahoocom-or-gmailcom
* Facebook: [/bambangpdp](http://www.facebook.com/bambangpdp)
* Twitter: [@bpdp](http://twitter.com/bpdp)
