����   < J  exercicioCond1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LexercicioCond1; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   
Entre com o primeiro valor
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , 
Entre com o segundo valor . 
Entre com o terceiro valor 0 java/lang/StringBuilder 2 O maior número é: 
 / 4  &
 / 6 7 8 append (I)Ljava/lang/StringBuilder;
 / : ; < toString ()Ljava/lang/String; args [Ljava/lang/String; n1 I n2 n3 maior leia Ljava/util/Scanner; StackMapTable > 
SourceFile exercicioCond1.java !               /     *� �    
                    	           l6� Y� � :� � !� '<� +� !� '=� -� !� '>� 6� 6� 6� � /Y1� 3� 5� 9� !�    
   6      
       %  +  3  9  B  K  T  k     >    l = >    O ? @  + A A @  9 3 B @   i C @   ] D E  F    � B  G     H    I