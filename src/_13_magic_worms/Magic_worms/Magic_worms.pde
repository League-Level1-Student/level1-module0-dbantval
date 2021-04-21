import java.util.Random;

void setup() {
  size(500,500);
  background(200,100,250);
  
}



void draw() {
  
  Random n = new Random();
  Random m = new Random();
  
  int x = n.nextInt(40);
  int y = m.nextInt(40);
  for ( int i = 300; i > 0; i-=2){

fill(x,i,y);
  ellipse(getWormX(i),getWormY(i),10,13); 
  }
  
  }
  
  
    float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
  
  
  
