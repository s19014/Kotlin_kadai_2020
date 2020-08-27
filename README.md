# Kotlin授業の課題  

## サービス名
Web電卓

## 使い方
1. 2つの枠内に数字を入力する（数字は小数点第2位まで可）
2. 演算子（+、-、×、÷）を選択する
3. 最後に計算ボタンを押す

## 使ったフレームワーク
Spring Boot

## コードを記入したファイルの説明
src/main/Kotlin/com.example.caluculater/CaluculatorApprication.kt
mainメソッド  
src/main/Kotlin/com.example.caluculater/model/FDat.kt
メンバ変数を作成
ゲッター、セッターを作成  
src/main/Kotlin/com.example.caluculater/controller/CalclateController.kt
inputメソッドは、フォームの入力にしたデータを記憶する
resultメソッドは、フォームの入力を計算し、その結果を返す
caluculaterメソッドは、入力があったデータから計算を行う  
src/main/resources/templates/index.html
データを入力するページ
src/main/resources/templates/result.html
計算結果を返すページ