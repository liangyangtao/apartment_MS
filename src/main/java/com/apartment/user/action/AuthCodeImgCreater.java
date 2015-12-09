package com.apartment.user.action;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class AuthCodeImgCreater {

	public ByteArrayInputStream createAuthcode(String authcode) {
		BufferedImage image = getAutoCodeImage(authcode);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		JPEGImageEncoder jpeg = JPEGCodec.createJPEGEncoder(bos);
		ByteArrayInputStream inputStream = null;
		try {
			jpeg.encode(image);
			byte[] bts = bos.toByteArray();
			inputStream = new ByteArrayInputStream(bts);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return inputStream;
	}

	private BufferedImage getAutoCodeImage(String authcode) {
		int width = 50;
		int height = 18;
		// 生成图片
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		// 设定背景色
		g.setColor(getRandColor(200, 250));
		g.fillRect(0, 0, width, height);
		// 设定字体
		Font mFont = new Font("Times New Roman", Font.BOLD, 18);// 设置字体
		g.setFont(mFont);
		// 画边框
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, width - 1, height - 1);
		// 随机产生干扰线，使图象中的认证码不易被其它程序探测到
		g.setColor(getRandColor(160, 200));
		// 生成随机类
		Random random = new Random();
		for (int i = 0; i < 155; i++) {
			int x2 = random.nextInt(width);
			int y2 = random.nextInt(height);
			int x3 = random.nextInt(12);
			int y3 = random.nextInt(12);
			g.drawLine(x2, y2, x2 + x3, y2 + y3);
		}

		// 将认证码显示到图象中
		g.setColor(new Color(20 + random.nextInt(110),
				20 + random.nextInt(110), 20 + random.nextInt(110)));

		g.drawString(authcode, 2, 16);

		// 图象生效
		g.dispose();
		return image;
	}

	private Color getRandColor(int fc, int bc) { // 给定范围获得随机颜色
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}

}
