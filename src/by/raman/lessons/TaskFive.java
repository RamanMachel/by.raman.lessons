package by.raman.lessons;
/*
4/Написать программу, которая проходит циклом по английскому алфавиту, начиная с буквы ‘b’,
и выводит каждую букву до тех пор, пока не встретит гласную (т.е. вывести согласные на консоль).
(Второй вариант: до второй гласной)
 */
public class TaskFive {
    public static void main(String[] args) {
        int leght = 0;
        for (char i = 'a'; i <'z' ; i++) {
            if(i!='a'&&i!='e'&&i!='i'&&i!='o'&&i!='y'&&i!='u')
            { leght++;
            char cursor = i;
            array(i);}
        }
        }
        public static void array(char cursor) {
            char[] alphabet = new char[21];
            for (int i = alphabet[0]; i < alphabet.length; i++) {
                alphabet[0] = cursor;
                print(alphabet);
            }
        }
        public static void print(char[] array){
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            }

        }



