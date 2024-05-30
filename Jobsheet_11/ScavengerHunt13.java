public class ScavengerHunt13 {
    Pointer13 head;

    public ScavengerHunt13() {
        this.head = null;
    }

    public void addPoint(String question, String answer) {
       Pointer13 newPoint = new Pointer13(question, answer);
        if (head == null) {
            head = newPoint;
        } else {
           Pointer13 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }

    public void displayPoints() {
       Pointer13 current = head;
        int index = 1;
        while (current != null) {
            System.out.println("Point " + index + ": " + current.pertanyaan);
            current = current.next;
            index++;
        }
    }

    public boolean checkAnswer(String userAnswer) {
        if (head != null) {
            if (head.jawaban.equals(userAnswer)) {
                head = head.next;
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
}
