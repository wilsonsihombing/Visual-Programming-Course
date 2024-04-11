#include <stdio.h>
#include <string.h>

int main(){
   char ISBN[3][30];
   float price[3];
   int jumlah[3];
   jumlah[0] = 0,jumlah[1] = 0, jumlah[2] = 0;
   float totalharga[3];
   float totkes;
   totalharga[0] = 0, totalharga[1] = 0; totalharga[2] = 0;
   int i = 0,j = 0;
    while( i < 3){
        scanf("%s", &ISBN[i]);
        if (strcmp(ISBN[i],"---") == 0){
            i = 3;
        }else{
            if (strcmp(ISBN[i],ISBN[0]) == 0){
                scanf("%f", &price[i]);
                scanf("%d", &jumlah[i]);
                jumlah[1] = jumlah[1]+jumlah[i];
                
            }else if (strcmp(ISBN[i],ISBN[1]) == 0){
                scanf("%f", &price[2]);
                scanf("%d", &jumlah[2]);
                jumlah[2] = jumlah[2]+jumlah[i];
                
            }else if (strcmp(ISBN[i],ISBN[2]) == 0){
                scanf("%f", &price[3]);
                scanf("%d", &jumlah[3]);
                jumlah[2] = jumlah[2]+jumlah[i];
               
            }else{

            }

        }
        
    }
    if(jumlah[0] >= 5){
        totalharga[0] = jumlah[0]*price[0]*0.98; 
    }else if(jumlah[0] >= 10){
        totalharga[0] = jumlah[0]*price[0]*0.95;   
    }else{
        totalharga[0] = jumlah[0]*price[0]*0.88;
    }

    if(jumlah[1] >= 5){
        totalharga[1] = jumlah[1]*price[1]*0.98; 
    }else if(jumlah[1] >= 10){
        totalharga[1] = jumlah[1]*price[1]*0.95;   
    }else{
        totalharga[1] = jumlah[1]*price[1]*0.88;
    }

    if(jumlah[2] >= 5){
        totalharga[2] = jumlah[2]*price[2]*0.98; 
    }else if(jumlah[2] >= 10){
        totalharga[2] = jumlah[2]*price[2]*0.95;   
    }else{
        totalharga[2] = jumlah[2]*price[2]*0.88;
    }

    totkes = totalharga[0]+totalharga[1]+totalharga[2];
    printf("%.2f", totkes);

    return 0;
}