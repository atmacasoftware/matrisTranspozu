# Matris Transpozu Bulma

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

Yapılan programda işlem adımları;
1. Kullanıcılardan ilk başta kaç satır ve kaç sütunluk matris yapılacağına ilişkin değer alınır.
2. Alınan değerlere göre `int[][] matris = new int[k][n];` oluşturulur.
3. Transpoz matrisi için `int[][] transpose = new int[n][k];` oluşturulur.
4. `matris` adlı dizinin doldurulması için `while` döngüsü kullanılır.
5. While döngüsü içerisinde `for` döngüleri ile her [i][j] için kullanıcıdan değer alınır.
6. Akabinde otomatik olarak matris oluşur ve ekrana hem matris hem de matrisin transpozu yazdırılır.
