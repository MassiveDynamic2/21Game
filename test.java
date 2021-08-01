import java.util.*;
class test {
    public static void main (String args [])
    {
        Scanner console = new Scanner(System.in);
        int arr1 [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        for (int i = 0;i<arr1.length;i++)
            {
                System.out.print(arr1[i]+" ");
            }
        System.out.println();
        System.out.println("chosen a number from the above group");
        System.out.println();
        System.out.println("now the number you've chosen is in which group ?");
        System.out.print("1 :");
        for(int i = 0;i<arr1.length;i=i+3)
            {
                System.out.print(arr1[i]+" ");
            }
        System.out.println();
        System.out.print("2 :");
        for(int i = 1;i<arr1.length;i=i+3)
            {
                System.out.print(arr1[i]+" ");
            }
        System.out.println();
        System.out.print("3 :");
        for(int i = 2;i<arr1.length;i=i+3)
            {
                System.out.print(arr1[i]+" ");
            }
            System.out.println();
        int input1 = console.nextInt();
        // first level if
            if(input1 == 1)
            {
                int arr2[] = {2,5,8,11,14,17,20,1,4,7,10,13,16,19,3,6,9,12,15,18,21};
                System.out.println();
                System.out.print("1 :");
                for(int i = 0;i<arr2.length;i=i+3)
                {

                    System.out.print(arr2[i]+" ");
                }
                System.out.println();
                System.out.print("2 :");
                for(int i = 1;i<arr2.length;i=i+3)
                {
                    System.out.print(arr2[i]+" ");
                }
                System.out.println();
                System.out.print("3 :");
                for(int i = 2;i<arr2.length;i=i+3)
                {

                    System.out.print(arr2[i]+" ");
                }
                //second level if
                System.out.println();
                System.out.println("the number you've chosen is in which group ?");
                int input2 = console.nextInt();
                if(input2 == 1)
                {
                    int arr3 [] = {5,14,1,10,19,9,18,2,11,20,7,16,6,15,8,17,4,13,3,12,21};
                    System.out.println();
                    System.out.print("1 :");
                    for(int i = 0;i<arr3.length;i=i+3)
                    {
    
                        System.out.print(arr3[i]+" ");
                    }
                    System.out.println();
                    System.out.print("2 :");
                    for(int i = 1;i<arr3.length;i=i+3)
                    {
                        System.out.print(arr3[i]+" ");
                    }
                    System.out.println();
                    System.out.print("3 :");
                    for(int i = 2;i<arr3.length;i=i+3)
                    {
    
                        System.out.print(arr3[i]+" ");
                    }
                    System.out.println();
                    System.out.println("the number you've chosen is in which group ?");
                    int input3 = console.nextInt();
                    //third level if
                    if(input3 == 2)
                    {
                        int arr4 [] = {5,10,18,20,6,17,3,14,19,2,7,15,4,12,1,9,11,16,8,13,21};
                        System.out.println("the number you've chosen is "+arr4[10]);
                    }
                    else{
                        int arr5 [] = {5,10,18,20,6,17,3,1,9,11,16,8,13,21,14,19,2,7,15,4,12};
                        System.out.println("the number you've chosen is "+arr5[10]);
                    }
                }
                //second level if input 2
                else if (input2 == 2) 
                {
                    int arr6[] = {2,11,20,7,16,6,15,5,14,1,10,19,9,18,8,17,4,13,3,12,21};
                    System.out.println();
                    System.out.print("1 :");
                    for(int i = 0;i<arr6.length;i=i+3)
                    {
    
                        System.out.print(arr6[i]+" ");
                    }
                    System.out.println();
                    System.out.print("2 :");
                    for(int i = 1;i<arr6.length;i=i+3)
                    {
                        System.out.print(arr6[i]+" ");
                    }
                    System.out.println();
                    System.out.print("3 :");
                    for(int i = 2;i<arr6.length;i=i+3)
                    {
    
                        System.out.print(arr6[i]+" ");
                    }
                    //third level if    
                    System.out.println();                
                    System.out.println("the number you've chosen is in which group ?");
                    int input3 = console.nextInt();
                    if(input3 == 1)
                    {
                        int arr7 [] = {11,16,5,10,18,4,12,2,7,15,1,9,17,3,20,6,14,19,8,13,21};
                        System.out.println("the number you've chosen is "+arr7[10]);
                    }
                    else if(input3 == 2)
                    {
                        int arr8 [] = {2,7,15,1,9,17,3,11,16,5,10,18,4,12,20,6,14,19,8,13,21};
                        System.out.println("the number you've chosen is "+arr8[10]);
                    }
                    else {
                        int arr9 [] = {2,7,15,1,9,17,3,20,6,14,19,8,13,21,11,16,5,10,18,4,12};
                        System.out.println("the number you've chosen is "+arr9[10]);
                    }
                }
                //second level if input 3
                else {
                    int arr10[] = {2,11,20,7,16,6,15,8,17,4,13,3,12,21,5,14,1,10,19,9,18};
                    System.out.println();
                    System.out.print("1 :");
                    for(int i = 0;i<arr10.length;i=i+3)
                    {
    
                        System.out.print(arr10[i]+" ");
                    }
                    System.out.println();
                    System.out.print("2 :");
                    for(int i = 1;i<arr10.length;i=i+3)
                    {
                        System.out.print(arr10[i]+" ");
                    }
                    System.out.println();
                    System.out.print("3 :");
                    for(int i = 2;i<arr10.length;i=i+3)
                    {
    
                        System.out.print(arr10[i]+" ");
                    }
                    //third level if
                    System.out.println();
                    System.out.println("the number you've chosen is in which group ?");
                    int input4 = console.nextInt();
                    if (input4 == 1)
                    {
                        int arr11[] = {11,16,8,13,21,1,9,2,7,15,4,12,14,19,20,6,17,3,5,10,18};
                        System.out.println("the number you've chosen is "+arr11[10]);
                    }
                    else{
                        int arr12[] = {2,7,15,4,12,14,19,11,16,8,13,21,1,9,20,6,17,3,5,10,18};
                        System.out.println("the number you've chosen is "+arr12[10]);
                    }
                }
            }
            //first level if
            else if(input1 == 2)
            {
                int arr13 [] = {1,4,7,10,13,16,19,2,5,8,11,14,17,20,3,6,9,12,15,18,21};
                System.out.println();
                System.out.print("1 :");
                for(int i = 0;i<arr13.length;i=i+3)
                {

                    System.out.print(arr13[i]+" ");
                }
                System.out.println();
                System.out.print("2 :");
                for(int i = 1;i<arr13.length;i=i+3)
                {
                    System.out.print(arr13[i]+" ");
                }
                System.out.println();
                System.out.print("3 :");
                for(int i = 2;i<arr13.length;i=i+3)
                {
                    System.out.print(arr13[i]+" ");
                }
                //second level if
                System.out.println();
                System.out.println("the number you've chosen is in which group ?");
                int input5 = console.nextInt();
                if(input5 == 1)
                {
                    int arr14 [] = {4,13,2,11,20,9,18,1,10,19,8,17,6,15,7,16,5,14,3,12,21};
                    System.out.println();
                    System.out.print("1 :");
                    for(int i = 0;i<arr14.length;i=i+3)
                    {
    
                        System.out.print(arr14[i]+" ");
                    }
                    System.out.println();
                    System.out.print("2 :");
                    for(int i = 1;i<arr14.length;i=i+3)
                    {
                        System.out.print(arr14[i]+" ");
                    }
                    System.out.println();
                    System.out.print("3 :");
                    for(int i = 2;i<arr14.length;i=i+3)
                    {
                        System.out.print(arr14[i]+" ");
                    }
                  //third level if
                  System.out.println();
                  System.out.println("the number you've chosen is in which group ?");
                  int input6 = console.nextInt();
                  if (input6 == 2)
                  {
                      int arr15[] = {4,11,18,19,6,16,3,13,20,1,8,15,5,12,2,9,10,17,7,14,21};
                      System.out.println("the number you've chosen is "+arr15[10]);
                  }
                  else{
                      int arr16[] = {4,11,18,19,6,16,3,2,9,10,17,7,14,21,13,20,1,8,15,5,12};
                      System.out.println("the number you've chosen is "+arr16[10]);
                  }
                }
                //second level if 
                else if (input5 == 2)
                {
                    int arr17[] = {1,10,19,8,17,6,15,4,13,2,11,20,9,18,7,16,5,14,3,12,21};
                    System.out.println();
                    System.out.print("1 :");
                    for(int i = 0;i<arr17.length;i=i+3)
                    {
    
                        System.out.print(arr17[i]+" ");
                    }
                    System.out.println();
                    System.out.print("2 :");
                    for(int i = 1;i<arr17.length;i=i+3)
                    {
                        System.out.print(arr17[i]+" ");
                    }
                    System.out.println();
                    System.out.print("3 :");
                    for(int i = 2;i<arr17.length;i=i+3)
                    {
                        System.out.print(arr17[i]+" ");
                    }
                    //third level if   
                    System.out.println();                 
                    System.out.println("the number you've chosen is in which group ?");
                    int input7 = console.nextInt();
                    if(input7 == 1)
                    {
                        int arr18 [] = {10,17,4,11,18,5,12,1,8,15,2,9,16,3,19,6,13,20,7,14,21};
                        System.out.println("the number you've chosen is "+arr18[10]);
                    }
                    else if(input7 == 2)
                    {
                        int arr19 [] = {1,8,15,2,9,16,3,10,17,4,11,18,5,12,19,6,13,20,7,14,21};
                        System.out.println("the number you've chosen is "+arr19[10]);
                    }
                    else {
                        int arr20 [] = {1,8,15,2,9,16,3,19,6,13,20,7,14,21,10,17,4,11,18,5,12};
                        System.out.println("the number you've chosen is "+arr20[10]);
                    }
                }
                //second level if
                else{
                    int arr21[] = {1,10,19,8,17,6,15,7,16,5,14,3,12,21,4,13,2,11,20,9,18};
                    System.out.println();
                    System.out.print("1 :");
                    for(int i = 0;i<arr21.length;i=i+3)
                    {
    
                        System.out.print(arr21[i]+" ");
                    }
                    System.out.println();
                    System.out.print("2 :");
                    for(int i = 1;i<arr21.length;i=i+3)
                    {
                        System.out.print(arr21[i]+" ");
                    }
                    System.out.println();
                    System.out.print("3 :");
                    for(int i = 2;i<arr21.length;i=i+3)
                    {
                        System.out.print(arr21[i]+" ");
                    }
                    //third level if
                    System.out.println();
                    System.out.println("the number you've chosen is in which group ?");
                    int input8 = console.nextInt();
                    if (input8 == 1)
                    {
                        int arr22[] = {10,17,7,14,21,2,9,1,8,15,5,12,13,20,19,6,16,3,4,11,18};
                        System.out.println("the number you've chosen is "+arr22[10]);
                    }
                    else{
                        int arr23[] = {1,8,15,5,12,13,20,10,17,7,14,21,2,9,19,6,16,3,4,11,18};
                        System.out.println("the number you've chosen is "+arr23[10]);
                    }
                }
            }
            //first level if
            else{
                int arr24 [] = {1,4,7,10,13,16,19,3,6,9,12,15,18,21,2,5,8,11,14,17,20};
                System.out.println();
                System.out.print("1 :");
                for(int i = 0;i<arr24.length;i=i+3)
                {

                    System.out.print(arr24[i]+" ");
                }
                System.out.println();
                System.out.print("2 :");
                for(int i = 1;i<arr24.length;i=i+3)
                {
                    System.out.print(arr24[i]+" ");
                }
                System.out.println();
                System.out.print("3 :");
                for(int i = 2;i<arr24.length;i=i+3)
                {
                    System.out.print(arr24[i]+" ");
                }
                //second level if
                System.out.println();
                System.out.println("the number you've chosen is in which group ?");
                int input8 = console.nextInt();
                 if (input8 == 1)
                {
                    int arr25[] = {4,13,3,12,21,8,17,1,10,19,9,18,5,14,7,16,6,15,2,11,20};
                    System.out.println();
                    System.out.print("1 :");
                    for(int i = 0;i<arr25.length;i=i+3)
                    {
    
                        System.out.print(arr25[i]+" ");
                    }
                    System.out.println();
                    System.out.print("2 :");
                    for(int i = 1;i<arr25.length;i=i+3)
                    {
                        System.out.print(arr25[i]+" ");
                    }
                    System.out.println();
                    System.out.print("3 :");
                    for(int i = 2;i<arr25.length;i=i+3)
                    {
                        System.out.print(arr25[i]+" ");
                    }
                    //third level if
                    System.out.println();
                    System.out.println("the number you've chosen is in which group ?");
                    int input9 = console.nextInt();
                    if (input9 == 2)
                    {
                        int arr26[] = {4,12,17,19,5,16,2,13,21,1,9,14,6,11,3,8,10,18,7,15,20};
                        System.out.println("the number you've chosen is "+arr26[10]);
                    }
                    else{
                        int arr27[] = {13,21,1,9,14,6,11,3,8,10,18,7,15,20,4,12,17,19,5,16,2};
                        System.out.println("the number you've chosen is "+arr27[10]);
                    }
                }
                //second level if
                else if (input8 == 2)
                {
                    int arr28[] = {7,16,6,15,2,11,20,4,13,3,12,21,8,17,1,10,19,9,18,5,14};
                    System.out.println();
                    System.out.print("1 :");
                    for(int i = 0;i<arr28.length;i=i+3)
                    {
    
                        System.out.print(arr28[i]+" ");
                    }
                    System.out.println();
                    System.out.print("2 :");
                    for(int i = 1;i<arr28.length;i=i+3)
                    {
                        System.out.print(arr28[i]+" ");
                    }
                    System.out.println();
                    System.out.print("3 :");
                    for(int i = 2;i<arr28.length;i=i+3)
                    {
                        System.out.print(arr28[i]+" ");
                    }
                    //third level if
                    System.out.println();
                    System.out.println("the number you've chosen is in which group ?");
                    int input9 = console.nextInt();
                    if(input9 == 1)
                    {
                        int arr29 [] = {6,11,13,21,1,9,14,7,15,20,3,8,10,18,16,2,4,12,17,19,5};
                        System.out.println("the number you've chosen is "+arr29[10]);
                    }
                    else if(input9 == 2)
                    {
                        int arr30 [] = {6,11,13,21,1,9,14,16,2,4,12,17,19,5,7,15,20,3,8,10,18};
                        System.out.println("the number you've chosen is "+arr30[10]);
                    }
                    else {
                        int arr31 [] = {16,2,4,12,17,19,5,6,11,13,21,1,9,14,7,15,20,3,8,10,18};
                        System.out.println("the number you've chosen is "+arr31[10]);
                    }
                }
                //second level if
                else{
                    int arr32[] = {4,13,3,12,21,8,17,7,16,6,15,2,11,20,1,10,19,9,18,5,14};
                    System.out.println();
                    System.out.print("1 :");
                    for(int i = 0;i<arr32.length;i=i+3)
                    {
    
                        System.out.print(arr32[i]+" ");
                    }
                    System.out.println();
                    System.out.print("2 :");
                    for(int i = 1;i<arr32.length;i=i+3)
                    {
                        System.out.print(arr32[i]+" ");
                    }
                    System.out.println();
                    System.out.print("3 :");
                    for(int i = 2;i<arr32.length;i=i+3)
                    {
                        System.out.print(arr32[i]+" ");
                    }
                    //{12,14,22,9} !IMPORTANT DO'NOT CHANGE 
                    //third level if
                    System.out.println();
                    System.out.println("the number you've chosen is in which group ?");
                    int input10 = console.nextInt();
                    if (input10 == 1)
                    {
                        int arr33[] = {13,21,7,15,20,19,5,4,12,17,6,11,10,18,3,8,16,2,1,9,14};
                        System.out.println("the number you've chosen is "+arr33[10]);
                    }
                    else{
                        int arr34[] = {3,8,16,2,1,9,14,13,21,7,15,20,19,5,4,12,17,11,10,18};
                        System.out.println("the number you've chosen is "+arr34[10]);
                    }
                }
            }
    }
}
