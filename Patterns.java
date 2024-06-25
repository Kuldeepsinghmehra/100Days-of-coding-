public class Patterns {
    public static void main(String[] args) {
        //pattern 1 
        // * * *
        // * * *
        // * * *
        // for(int i=0;i<5;i++)
        // {
        //     for(int j=0;j<5;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

//         pattern 2

// * 
// * * 
// * * *
// * * * *
// * * * * *

//         for(int i =0;i<5;i++)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print('*');

//             }
//             System.out.println();
//         }

// pattern
// 1
// 12
// 123
// 1234
// 12345
    
//         for(int i =1;i<=5;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(j);

//             }
//             System.out.println();
//         }
// for(int i=1;i<=5;i++)
// {
//     for(int j=0;j<i;j++)
//     {
//         System.out.print(i);
//     }
//     System.out.println();
// }

// pattern
// *****
// ****
// ***
// **
// for(int i=0;i<5;i++)
// {
//     for(int j=5;j>i;j--)
//     {
//         System.out.print('*');

//     }
//     System.out.println();
// }

for(int i=5;i<0;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.println(j);
    }
    System.out.println();
}

    }
    
}
