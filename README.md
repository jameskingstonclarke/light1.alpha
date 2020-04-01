# light1.alpha
Light1 is the universe...

Server & Client:

Light1 has a server side and a client side. The ambiguity here is that there is a server running, regardless of whether you are on a networked system.
The server is responsible for handling all global logic that is critical for the global game state. The client logic is responsible for handling all logic
that is not game logic critical.
Note, server and client events are all sent to the plugin logic, it's up to the plugin to decide what do do with these events.


Components:
Components are plugins, enviroments and artifacts.

Plugins:
The role of the plugin is to simply register all enviroments and artifacts to the engine. Plugins can also recieve plugin specific events such as pause,
load, de-register etc (any file can register tick events).

Environments:
Enviroments are like docker containers for plugins and artifacts. Artifacts can interact with other artifacts within their enviroment. A plugin 
can have many enviroments. Enviroments can also define behaviour for their containing artifacts.

Artifacts:
To be clear, Light1 is essentially a glorified ECS system, and artifacts are these entities. Artifacts 'traits' are defined in json files. The reason for this
is plugin compatability. Plugins that are not aware of Java class files need to access these traits, this is done via artifact trait descriptors. These are stored
in the /resources/artifacts/ directory.


Events:
There are 4 event categories, global events (tick, preTick etc which anything can register to), plugin events (onLoad, onExit etc which only 
plugin events can register), enviroment events (tick, preTick etc) and artifact events (tick, pretick etc).
components can generate any event type, so that only those types can recieve that event. E.g. say when a coin artifact decreases in value, it may want
to tell every plugin that its value has decreased. It can pass an event onto the plugin event bus which can then be recieved by any plugin.