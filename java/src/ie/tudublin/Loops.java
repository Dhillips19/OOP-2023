package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;

	public void settings() {
		size(800, 800);
		// fullScreen(SPAN);
	}

	public void setup() {
		colorMode(HSB);
	}

	public void keyPressed() {

		mode = key - '0';
		println(mode);
	}

	float off = 0;

	public void draw() {
		background(0);
		fill(255);
		noStroke();

		switch (mode) {
			case 0:
				int numCircles = (int) max(1, mouseX / 50.0f);
				float d = width / numCircles;
				for (int j = 0; j < numCircles; j++) {
					for (int i = 0; i < numCircles; i++) {
						float x = (d * 0.5f) + (d * i);
						float y = (d * 0.5f) + (d * j);
						float c = ((i + j) / ((numCircles - 1) * 2.0f)) * 255.0f;
						fill((c + off) % 256, 255, 255);
						circle(x, y, d);
					}
				}
				off += (mouseY / 50.0f);
				/*
				 * int numRect = 10;
				 * float rectWidth = width / numRect;
				 * for (int i = 0; i < numRect; i++)
				 * {
				 * float x = rectWidth * i;
				 * float y = 0;
				 * fill(i * 20, 255, 255);
				 * rect(x, y, rectWidth, height);
				 * }
				 */
				break;
			case 1:
				int numRect2 = 10;
				float rectWidth2 = width / numRect2;
				for (int i = 0; i < numRect2; i++) {
					float x = rectWidth2 * i;
					float y = rectWidth2 * i;
					float w = rectWidth2;
					float h = height / numRect2;
					fill(i * 25, 255, 255);
					rect(x, y, w, h);
				}
				break;
			case 2:
				int numRect3 = 10;
				float rectWidth3 = width / numRect3;
				for (int i = 0; i < numRect3; i++) {
					float x = rectWidth3 * i;
					float y = rectWidth3 * i;
					float w = rectWidth3;
					float h = height / numRect3;
					fill(i * 25, 255, 255);
					rect(x, y, w, h);
					rect(width - rectWidth3 - x, y, w, h);

				}
				break;
			case 3:
				int numEllipse = 10;
				float ellipseWidth = width / numEllipse;
				int halfWidth = width / 2;
				for (int i = 0; i < numEllipse; i++) {
					float diameter = ellipseWidth * i;
					fill(255 - (i * 25), 255, 255);
					ellipse(halfWidth, halfWidth, width - diameter, width - diameter);
				}
				break;
			case 4:
				int numEllipse2 = 10;
				float ellipseDiameter2 = width / numEllipse2;
				float ellipseCentre2 = ellipseDiameter2 / 2;
				for (int i = 0; i < numEllipse2; i++) {
					float x = ellipseCentre2 + (i * ellipseDiameter2);
					float y = ellipseCentre2;
					fill(i * 19, 255, 255);
					ellipse(x, y, ellipseDiameter2, ellipseDiameter2);
				}
				break;
			case 5:
				int numEllipse3 = (int) mouseX;
				float ellipseDiameter3 = width / numEllipse3;
				float ellipseCentre3 = ellipseDiameter3 / 2;
				for (int i = 0; i < numEllipse3; i++) {
					for (int j = 0; j < numEllipse3; j++) {
						float x = ellipseCentre3 + (j * ellipseDiameter3);
						float y = ellipseCentre3 + (i * ellipseDiameter3);
						fill((i + j) * 9, 255, 255);
						ellipse(x, y, ellipseDiameter3, ellipseDiameter3);
					}
				}
				break;
			default:
				break;
		}

	}
}
