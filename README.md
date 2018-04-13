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
* Place the .jar-File in the same folder as your editor.html and your viewer.html file.
* Run it with `java -jar` (make sure no other application is already running on ports 8080 and 8090)
* open a browser and open http://localhost:8080
* you can now use the editor to produce data or edit JSON data manually in the text area. You can update your editor according to the data or your data according to what's in your editor. And of course you can update your viewer according to the data.
* when you are done you can terminate the server by pressing enter in the console window

The screenshot below shows a running test host.
A JSON data object has been loaded from the data entered into the editor. This JSON data object is displayed in the textarea and the Viewer displays the data accordingly.
The title property of the data object is displayed in `<div id="title"></div>`.
The editor.html-file and the viewer.html-file are in the same folder as the jar-file and are dynamically loaded into `<div id="editor_container"></div>` and `<div id="viewer_container"></div>`. The example shows [FillInContentEditor](https://github.com/MicroContent/FillInContentEditor) and [FillInContentViewer](https://github.com/MicroContent/FillInContentViewer).

![Screenshot of MicroContent Development Test Host](https://github.com/MicroContent/McToolset/raw/master/TestHostScreenshot.PNG)
