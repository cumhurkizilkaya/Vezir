
import java.util.Random;
/**
*
* @author cumhur
*/
public class Vezir {
	
	
public static void main(String[] args) {
int[][] dizi = new int[8][8];
create(dizi);
for (int i = 0; i < 8; i++) {
for (int j = 0; j < 8; j++) {
System.out.print(dizi[i][j] + "-");
}
System.out.println("");
}
System.out.println("-----");
Test(dizi);
System.out.println("-----");
vezirleriYenidenYerlestir(dizi);
}


public static void create(int[][] dizi) {
Random rand = new Random();
int vezirYerlestirilenSutun;
for (int i = 0; i < 8; i++) {
vezirYerlestirilenSutun = rand.nextInt(7) + 1;
dizi[i][vezirYerlestirilenSutun] = 1;
}
}


public static void Test(int[][] dizi) {
int sutunCakismaSayisi = 0;
int caprazCakismaSayisi = 0;
int hangiSutundaVezirVar[] = new int[8];
for (int i = 0; i < 8; i++) {
for (int j = 0; j < 8; j++) {
if (dizi[i][j] == 1) {
hangiSutundaVezirVar[i] = j;
}
}
}

System.out.println("Vezirlerin Bulundu�u sutunlar :");
for (int i = 0; i < 8; i++) {
System.out.print(hangiSutundaVezirVar[i] + "-");
}
System.out.println("");

for (int i = 0; i < 8; i++) {
int sat�rDegeri = hangiSutundaVezirVar[i];
for (int j = 0; j < 8; j++) {
if (sat�rDegeri != j) {
if (sat�rDegeri == hangiSutundaVezirVar[j]) {
sutunCakismaSayisi++;
}
if (i == j) {
sutunCakismaSayisi--;
}
}
}
}
System.out.println("ayn� sutunda bulunan vezirlerin cak��ma sayisi :" + sutunCakismaSayisi);


for (int i = 0; i < 7; i++) {
int sutunNo = hangiSutundaVezirVar[i];
int sat�rNo = i;
while (sutunNo < 7) {
sat�rNo++;
sutunNo++;
if (sat�rNo < 8 && dizi[sat�rNo][sutunNo] == 1) {
caprazCakismaSayisi++;
}
}
}
System.out.println("sag asagi tarafa satir ++ ve sutun ++ :" + caprazCakismaSayisi);
int sol_caprazCakismaSayisi = 0;
for (int i = 0; i < 7; i++) {
int sutunNo = hangiSutundaVezirVar[i];
int sat�rNo = i;
while (sutunNo > 0) {
sat�rNo++;
sutunNo--;
if (sat�rNo < 8 && dizi[sat�rNo][sutunNo] == 1) {
sol_caprazCakismaSayisi++;
}
}
}

System.out.println("sol asagi tarafa satir ++ ve sutun -- :" + sol_caprazCakismaSayisi);
int sagYukaricaprazCakismaSayisi = 0;
for (int i = 7; i > 0; i--) {
int sutunNo = hangiSutundaVezirVar[i];
int sat�rNo = i;
while (sutunNo < 7) {
sat�rNo++;
sutunNo++;
if (sat�rNo < 8 && dizi[sat�rNo][sutunNo] == 1) {
sagYukaricaprazCakismaSayisi++;
}
}
}
System.out.println("sag yukar� tarafa satir -- ve sutun -- :" + sagYukaricaprazCakismaSayisi);
int solYukaricaprazCakismaSayisi = 0;
for (int i = 7; i > 0; i--) {
int sutunNo = hangiSutundaVezirVar[i];
int sat�rNo = i;
while (sutunNo > 0) {
sat�rNo++;
sutunNo--;
if (sat�rNo < 8 && dizi[sat�rNo][sutunNo] == 1) {
solYukaricaprazCakismaSayisi++;
}
}
}
System.out.println("sol yukari tarafa satir -- ve sutun -- :" + solYukaricaprazCakismaSayisi);
int toplamCakisma = solYukaricaprazCakismaSayisi + sagYukaricaprazCakismaSayisi + sol_caprazCakismaSayisi + caprazCakismaSayisi + sutunCakismaSayisi;
System.out.println("herbir vezir i�in toplam cakisma sayisi :" + toplamCakisma);
}


public static void vezirleriYenidenYerlestir(int[][] dizi) {

	
int sutunCakismaSayisi = 0;
int caprazCakismaSayisi = 0;
int hangiSutundaVezirVar[] = new int[8];
for (int i = 0; i < 8; i++) {
for (int j = 0; j < 8; j++) {
if (dizi[i][j] == 1) {
hangiSutundaVezirVar[i] = j;
}
}
}


int j;
int k;
for (int i = 0; i < 8; i++) {
for (j = 0; j < 8; j++) {
sutunCakismaSayisi = 0;
for (k = 0; k < 8; k++) {
if (dizi[k][j] == 1) {
sutunCakismaSayisi++;
}
}

System.out.println(i + " sat�r�ndaki vezir " + j + " sutununa cekilirse " + sutunCakismaSayisi + " sutunda cakisma olur");
}
System.out.println("----------");
}


int e;
for (int a = 0; a < 8; a++) {
for (e = 0; e < 8; e++) {
int sutunNo = a;
int sat�rNo = e;
caprazCakismaSayisi = 0;
while (sutunNo < 7) {
sat�rNo++;
sutunNo++;
if (sat�rNo < 8 && dizi[sat�rNo][sutunNo] == 1) {
caprazCakismaSayisi++;
}
}


System.out.println(a + " sat�r�ndaki vezir " + e + " sutununa cekilirse sag asagi tarafa satir:" + caprazCakismaSayisi);
}
System.out.println("---------");
}
int c;
int sol_caprazCakismaSayisi = 0;
for (int a = 0; a < 8; a++) {
for (c = 0; c < 8; c++) {
int sutunNo = a;
int sat�rNo = c;
sol_caprazCakismaSayisi = 0;
while (sutunNo > 0) {
sat�rNo++;
sutunNo--;
if (sat�rNo < 7 && dizi[sat�rNo][sutunNo] == 1) {
sol_caprazCakismaSayisi = 0;
}
}


System.out.println(a + " sat�r�ndaki vezir " + c + " sutununa cekilirse sag asagi tarafa :" + sol_caprazCakismaSayisi);
}
System.out.println("------------------------------------------");
}
int sagYukaricaprazCakismaSayisi = 0;
for (int a = 0; a < 8; a++) {
for (c = 8; c > 0; c--) {
int sutunNo = a;
int sat�rNo = c;
sagYukaricaprazCakismaSayisi = 0;
while (sutunNo < 7) {
sat�rNo++;
sutunNo++;
if (sat�rNo < 8 && dizi[sat�rNo][sutunNo] == 1) {
sagYukaricaprazCakismaSayisi++;
}
}

System.out.println(a + " sat�r�ndaki vezir " + c + " sutununa cekilirse sag asagi tarafa :" + sagYukaricaprazCakismaSayisi);
}
System.out.println("------------------------------------------");
}
int solYukaricaprazCakismaSayisi = 0;
for (int a = 0; a < 8; a++) {
for (c = 8; c > 0; c--) {
int sutunNo = a;
int sat�rNo = c;
solYukaricaprazCakismaSayisi = 0;
while (sutunNo > 0) {
sat�rNo++;
sutunNo--;
if (sat�rNo < 8 && dizi[sat�rNo][sutunNo] == 1) {
solYukaricaprazCakismaSayisi++;
}

System.out.println(a + " sat�r�ndaki vezir " + c + " sutununa cekilirse sag asagi tarafa :" + solYukaricaprazCakismaSayisi);
}
System.out.println("-------");
   }

   }
 }
}