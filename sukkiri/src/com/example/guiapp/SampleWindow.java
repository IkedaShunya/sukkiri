package com.example.guiapp;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SampleWindow extends JFrame { //①JFrame の派生クラスの生成
	SampleWindow(){ //②画面構成
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320,160);
		Container contentPane = getContentPane(); //③コンテントペインの取得
		//コンテントペインにレイアウトを配置
		contentPane.setLayout(new BorderLayout()); //④レイアウト方式の指定

		//⑤GUI 部品(コンポーネント)のインスタンス(オブジェクト)の生成
		//ラベルのインスタンスを生成
		JLabel label = new JLabel("SwingLabel");
		//ボタンのインスタンスを生成
		JButton button = new JButton("SwingButton");

		//⑥GUI 部品(コンポーネント)オブジェクトの配置
		//ラベルを ContentPane に配置
		contentPane.add(label, BorderLayout.NORTH);
		//ボタンを ContentPane に配置
		contentPane.add(button, BorderLayout.SOUTH);
		
		
		
		//複雑な画面をつくる
		//JPanel の生成
		JPanel panel = new JPanel();
		//レイアウトマネージャーの設定
		panel.setLayout( new FlowLayout()) ;
		//部品を配置
		panel.add( new JLabel("Label A") );
		panel.add( new JLabel("Label B") );
		//JPanel を ContentPane に配置
		contentPane.add(panel, BorderLayout.CENTER);


	}
}