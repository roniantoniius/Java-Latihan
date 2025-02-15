

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public int getAlphabetIdx(char posisi){
        if (posisi >= 'a' && posisi <= 'z'){
            return posisi - 'a';
        } else if (posisi >= 'A' && posisi <= 'Z'){
            return posisi - 'A';
        } else {
            return -1;
        }
    }
    
    public char ambilPertama(){
        return this.name.charAt(0);
    }

    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Student murid){
        return this.name.compareTo(murid.name);
    }

}
