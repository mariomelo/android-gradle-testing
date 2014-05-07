test:
	cp -R build/source/r/debug/* src/main/java
	gradle test -b build.unit
	gradle jacocoTestReport -b build.unit
	find ./src -name "R.java" -type f -delete

clean:
	find ./src -name "R.java" -type f -delete
	gradle clean