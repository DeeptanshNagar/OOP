interface EventHandler {
    void handleEvent();
}

class EventDemo {
    public void registerEvent() {
        class LocalEventHandler implements EventHandler {
            public void handleEvent() {
                System.out.println("Event handled by local inner class");
            }
        }
        EventHandler localHandler = new LocalEventHandler();
        localHandler.handleEvent();
    }

    public static void main(String[] args) {
        EventDemo demo = new EventDemo();
        demo.registerEvent();
        EventHandler anonymousHandler = new EventHandler() {
            public void handleEvent() {
                System.out.println("Event handled by anonymous inner class");
            }
        };
        anonymousHandler.handleEvent();
    }
}

