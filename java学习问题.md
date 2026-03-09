# 1.IDEA某个代码文件运行灰色咋办

找到要运行的代码文件对应的文件夹，右键点击该文件夹，将文件标记为测试源代码文件夹即可

<img src="./pic/IDEA_gray.png" alt="IDEA_gray" style="zoom:33%;" />

# 2.IDEA快捷键

+ psvm: public static  void main 
+ sout: System.out.println()
+ 100.fori: for (i = 0; i<100; i++)

+ Age.fori ：遍历数组

  ```
  for (int i = 0; i < age.length; i++) {
      
  }
  ```

+ print这个api默认不换行,println这个api默认换行 

+ option control + v自动补齐代码的右边 

# 3.一些学习当中需要注意的

## 3.1 隐式类型转换

* 取值范围小的，和取值范围大的进行运算，小的会先提升为大的，再进行运算。
* byte、short、char三种类型的数据在运算的时候，都会直接先提升为int，然后再进行运算。

## 3.2 强制类型转换

int b = (int) a

## 3.3 三元运算符

int max =  a > b ? a : b ;

## 3.4  