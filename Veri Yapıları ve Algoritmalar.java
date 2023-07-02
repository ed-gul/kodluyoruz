# Project 1
## Soru 1
[22,27,16,2,18,6] → Insertion Sort
**Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.**

0. [22,27,16,2,18,6] (n)
1. [2,27,16,22,18,6] (n-1)
2. [2,6,16,22,18,27] (n-2)
3. [2,6,16,18,22,27] 1

**Big-O gösterimini yazınız.**
Toplam işlem [n(n+1)]/2, dominant terim n^2. O(n^2)

**Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız.**
    1. Average case: Aradığımız sayının ortada olması -> 1.Avarage Case, ortada [2,6,16,18,22,27]
    2. Worst case: Aradığımız sayının sonda olması
    3. Best case: Aradığımız sayının dizinin en başında olması.

## Soru 2
**[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.**

0. [7,3,5,8,2,9,4,15,6]
1. [2,3,5,8,7,9,4,15,6]
2. [2,3,4,8,7,9,5,15,6]
3. [2,3,4,5,7,9,8,15,6]
4. [2,3,4,5,6,9,8,15,7]

# Project 2
## Soru 1
[16,21,11,8,12,22] -> Merge Sort
**Yukarıdaki dizinin sort türüne göre aşamalarını yazınız. Big-O gösterimini yazınız.**
[16,21] - [11,8] - [12,22] 
[16] [21] [11] [8] [12] [22]
[8,11,12,16,21,22]
n adet işlem yapıldı. 2^x = n , logn=x. O(nlogn)

# Proje 3
## Soru 1
**[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız. Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.**
En sağdaki değeri seçtim; Root 2'dir.

2nin sol altında 1, 1in sol altında 0 bulunur. 0-1-2
7, 2nin sağ altında bulunur. 
5, 7nin sol altında bulunur.
8, 7nin sağ altında bulunur
3, 5in sol altında bulunur.
6, 5in sağ altında bulunur.
9, 8in sağ altında bulunur.
4, 3ün sağ altında bulunur.

![resim](https://github.com/ed-gul/kodluyoruz/assets/134861274/013a4192-2fe4-477a-849c-a5c4dc65ab3c)


   
