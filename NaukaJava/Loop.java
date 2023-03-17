public class Loop {
    // wypisz liczby podzielne przez 3 z przedziału 1-100
    // odwroc tablice [1,3,5] -> [5,3,1]
    public static void main(String[] args) {
    for (int i=1; i<100;i++){
        if (i%3==0){
            System.out.println(i);
        }
       }
    int[] tablica = new int[] {1,3,5,7,9};
    for (int i=0; i<(tablica.length/2); i++){
        int temp = tablica[i];
        tablica[i] = tablica[(tablica.length-1-i)];
        tablica[(tablica.length-1-i)] = temp;
        }
    for (int i=0; i< tablica.length; i++){
        System.out.println(tablica[i]);
        }
    }
}