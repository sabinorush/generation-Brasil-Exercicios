����   < V  exercicioCond4  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LexercicioCond4; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   
Digite um número: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * 	nextFloat ()F , Número par
 " . / 0 printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
 2 4 3 java/lang/Math 5 6 sqrt (D)D 8 Raiz Quadrada: %2.2f
 : < ; java/lang/Double = > valueOf (D)Ljava/lang/Double; @ Número Ímpar@       
 2 D E F pow (DD)D H "Quadrado do valor ímpar é: %2.2f args [Ljava/lang/String; n1 F raiz D quadrado leia Ljava/util/Scanner; StackMapTable J 
SourceFile exercicioCond4.java !               /     *� �    
                    	           |� Y� � :� � !� 'D#r�� -� +� � -W#�� 1I� 7� Y(� 9S� -W� 2#r�� *� ?� !#� A� C9� G� Y� 9S� -W�    
   6    
       "  /  5  I  L  T  \  f  {     4    | I J    b K L  5  M N  f  O N   p P Q  R    � L  S       .  T    U