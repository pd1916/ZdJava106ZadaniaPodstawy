package pl.sdacademy.java.basic.exercises.day3.task11;

public class Computer {
    private final Processor processor;
    private final Memory memory;
    private final ExternalPort externalPort;

    public Computer(Processor processor, Memory memory, ExternalPort externalPort) {
        this.processor = processor;
        this.memory = memory;
        this.externalPort = externalPort;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", externalPort=" + externalPort +
                '}';
    }

    public static class Processor {
        private final int cores;
        private final String producer;

        public Processor(int cores, String producer) {
            this.cores = cores;
            this.producer = producer;
        }

        @Override
        public String toString() {
            return "Processor{" +
                    "cores=" + cores +
                    ", producer='" + producer + '\'' +
                    '}';
        }
    }

    public static class Memory {
        private final int memory;
        private final String producer;
        private final String type;

        public Memory(int memory, String producer, String type) {
            this.memory = memory;
            this.producer = producer;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Memory{" +
                    "memory=" + memory +
                    ", producer='" + producer + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    public static class ExternalPort {
        private final String type;

        public ExternalPort(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "ExternalPort{" +
                    "type='" + type + '\'' +
                    '}';
        }
    }
}
