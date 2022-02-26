package pl.sdacademy.java.basic.exercises.day3.task10;

public class Email {
    // mozemy dac final
    private final String receiver;
    private final String title;
    private final String bodyMsg;
    private final String attachment;

    public Email(Builder b) {
        this.receiver = b.receiver;
        this.title = b.title;
        this.bodyMsg = b.bodyMsg;
        this.attachment = b.attachment;
    }

    @Override
    public String toString() {
        return "Email{" +
                "receiver='" + receiver + '\'' +
                ", title='" + title + '\'' +
                ", bodyMsg='" + bodyMsg + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }

    // tzw klasa wewnętrzna
    // w naszym przypadku posiada analogiczne pola jak klasa Email, pola te posłużą nam do utworzenia docelowego obiektu klasy Eamil
    // jest to przykład jednego z wzorców projektówych - Builder
    public static class Builder {
        private String receiver;
        private String title;
        private String bodyMsg;
        private String attachment;

        public Builder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder bodyMsg(String bodyMsg) {
            this.bodyMsg = bodyMsg;
            return this;
        }

        public Builder attachment(String attachment) {
            this.attachment = attachment;
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }
}