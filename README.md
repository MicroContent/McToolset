# McToolset

McToolset is a repo that contains tools to support the development of [MicroContent](https://microcontent.github.io/) for Social MicroLearning environments.

As of now it encompasses:
* MicroContent Development Test Host

## MicroContent Development Test Host
A simple static server for local development based on [NanoHttpd](https://github.com/NanoHttpd/nanohttpd).

### What it does
Essentially it starts two Web-Servers:
1. MicroContent Test Host on port 8080
2. SimpleWebServer to statically host MicroContent from the File System on port 8090 (with CORS enabled)

### How to use it
* Download the latest release
* Place the .jar-File in the same folder as your index.html file.
* Run it with `java -jar` (make sure no other application is already running on ports 8080 and 8090)
* open a browser and open http://localhost:8080
* enter a JSON data object that your MicroContent expects from the getData method into the textarea of the host and click on "Update Data and Load View"
* when you are done you can terminate the server by pressing enter in the console window

The screenshot below shows a running test host.
A a valid JSON data object has been entered in the textarea and the "Update Data and Load View" button has been clicked.
The title property of the data object is displayed in `<div id="title"></div>`
The index.html-file in the same folder as the jar-file (in this case C:\Data\Downloads\index.html) was dynamically loaded into `<div id="container"></div>`. The example shows [BinaryNumberContentViewer](https://github.com/MicroContent/BinaryNumberContentViewer).

![Screenshot of MicroContent Development Test Host](https://github.com/MicroContent/McToolset/raw/master/TestHostScreenshot.PNG)
