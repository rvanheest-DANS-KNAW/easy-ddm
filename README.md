# easy-ddm
[![Build Status](https://travis-ci.org/DANS-KNAW/easy-ddm.svg?branch=master)](https://travis-ci.org/DANS-KNAW/easy-ddm)
DANS Dataset Metadata library


BUILDING FROM SOURCE
--------------------

Prerequisites:

* Java 8 or higher
* Maven 3.3.3 or higher
 
Steps:

        git clone https://github.com/DANS-KNAW/easy-ingest-flow
        cd easy-ingest-flow
        mvn install

Replace the question marks in the `mvn` options
`-Deasy.emd.version=???` and/or `-Deasy.schema.version=???`
to use locally compiled versions of [easy-schema] respectively [easy-emd].
You can find the available versions in `~/.m2/repository/nl/knaw/dans/easy/easy-schema`
respectively `~/.m2/repository/nl/knaw/dans/easy/emd`.

[easy-schema]: https://github.com/DANS-KNAW/easy-schema
[easy-emd]: https://github.com/DANS-KNAW/easy-emd