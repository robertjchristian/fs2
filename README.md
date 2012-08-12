FS2
====
Flexible Storage System - URI-centric Middleware API for accessing data residing anywhere.

What is FS2?
============================
...

Why FS2?
============================

Prerequisites
============================
* JDK6 or greater.


How to build
============================

With Ant
====
from fs2, run "ant"

In Eclipse
===
_The fs2 module is committed to git with Eclipse project settings (.project/.classpath) at the root.  So getting started is as easy as_
File->Import->General->Existing Projects into Workspace->Next->Select Root Directory-Browse->Select fs2

Tests
============================
See that the unit test structure mirrors the src structure.
<pre>
tests
└── com
    └── fs2
        ├── api
        │   ├── AbstractAPITest.java
        │   └── MetadataSerializationTest.java
        └── storage
            ├── file
            │   └── FileAPITest.java
            └── memory
                └── MemoryAPITest.java
</pre>
The AbstractAPITest is meant to serve as a functional-level test of the API, exercising CRUD, tree manipulations, and list functionality.  For each concrete implementation, simply extend the base test to make sure it is included.  For example, the concrete FileAPITest looks like this:
<pre>
public class FileAPITest extends AbstractAPITest {
  @Override
  protected FlexibleStorageSystem getFS2Instance() {
    FS2Configuration config = new FS2DefaultFileConfig();
    return FS2Factory.newInstance(config);
  }
}
</pre>
This makes it simple to add new concrete storage repo implementations within the test suite.

Roadmap
============================

* Allow use of regular expressions in assertions.
* Provide richer test examples.  This most likely means building a web app that authenticates, and examines headers and payloads.
* Add in support for spawning many tests instances at a time to facilitate stress testing.
* Allow use of tokens in metadata files for greater flexibility.  For example url could contain http://${host}${port}/foo/bar and the values for host and port could be passed in on the command line or via properties file.  This would work the same way for payloads, headers, and assertions.
* Consider certificate support for SSL. (currently no client cert support, and always trusts host cert)
* Consider building a set of penetration tests based on OWASP.
* Consider removing requests in favor of urllib2 so that there are no prerequisites other than Python.

Support
============================
* Report issues [here] (https://github.com/robertjchristian/fs2/issues)
* [Wiki] (https://github.com/robertjchristian/fs2/wiki)
* Also see the [fs2 project page] (http://robertjchristian.github.com/fs2)