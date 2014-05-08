test:
	cp -R app/build/source/r/debug/* app/src/main/java
	gradle test -b app/build.unit
	gradle jacocoTestReport -b app/build.unit
	find ./app/src -name "R.java" -type f -delete

clean:
	find ./app/src -name "R.java" -type f -delete
	gradle clean

real-test:
	find ./app/src -name "R.java" -type f -delete
	gradle connectedInstrumentTest