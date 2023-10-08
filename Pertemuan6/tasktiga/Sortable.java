package tasktiga;

// Deklarasi antarmuka Sortable
interface Sortable {
    // Metode abstract untuk membandingkan dua objek yang dapat diurutkan
    int compare(Sortable b);

    // Metode static untuk mengurutkan array objek yang mengimplementasikan antarmuka Sortable
    static void shell_sort(Sortable[] a) {
        // Menghitung panjang array
        int n = a.length;

        // Inisialisasi nilai h untuk algoritma ShellSort
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1; // Inisialisasi nilai h
        }

        // Implementasi algoritma ShellSort
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && a[j].compare(a[j - h]) < 0; j -= h) {
                    // Menukar elemen-elemen dalam array jika diperlukan
                    Sortable temp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = temp;
                }
            }
            h = h / 3; // Reduksi nilai h untuk iterasi selanjutnya
        }
    }
}




