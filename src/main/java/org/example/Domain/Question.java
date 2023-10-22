package org.example.Domain;

public class Question {
      private String text;
      private Answer answers;

        public Question(String text, Answer answers) {
                this.text = text;
                this.answers = answers;
        }

        public String getText() {
                return text;
        }

        public void setText(String text) {
                this.text = text;
        }

        public Answer getAnswers() {
                return answers;
        }

        public void setAnswers(Answer answers) {
                this.answers = answers;
        }

        @Override
        public String toString() {
                return "Question{" +
                        "text='" + text + '\'' +
                        ", answers=" + answers +
                        '}';
        }
}
