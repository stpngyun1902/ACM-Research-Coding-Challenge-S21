# ACM Research Coding Challenge (Spring 2021)

## No Collaboration Policy

**You may not collaborate with anyone on this challenge.** You _are_ allowed to use Internet documentation. If you _do_ use existing code (either from Github, Stack Overflow, or other sources), **please cite your sources in the README**.

## Submission Procedure

Please follow the below instructions on how to submit your answers.

1. Create a **public** fork of this repo and name it `ACM-Research-Coding-Challenge-S21`. To fork this repo, click the button on the top right and click the "Fork" button.
2. Clone the fork of the repo to your computer using `git clone [the URL of your clone]`. You may need to install Git for this (Google it).
3. Complete the Challenge based on the instructions below.
4. Submit your solution by filling out this [form](https://acmutd.typeform.com/to/uqAJNXUe).

## Question One

Genome analysis is the identification of genomic features such as gene expression or DNA sequences in an individual's genetic makeup. A genbank file (.gb) format contains information about an individual's DNA sequence. The following dataset in `Genome.gb` contains a complete genome sequence of Tomato Curly Stunt Virus. 

**With this file, create a circular genome map and output it as a JPG/PNG/JPEG format.** We're not looking for any complex maps, just be sure to highlight the features and their labels.

**You may use any programming language you feel most comfortable. We recommend Python because it is the easiest to implement. You're allowed to use any library you want to implement this**, just document which ones you used in this README file. Try to complete this as soon as possible.

Regardless if you can or cannot answer the question, provide a short explanation of how you got your solution or how you think it can be solved in your README.md file. However, we highly recommend giving the challenge a try, you just might learn something new!

## Solution Approach
This challenge is a hard one to me. First, it took me a while to fully understand the mission by finding out what is a Genome Map and how a GenBank file data is stored. After that, I took more time to fully understand the format of a Genome Map and how nucleotides are drawn and showed in the map. After getting a full understanding of Genome Map, I started to look for libraries or open source packages that would help me draw a map using given GenBank file. I found several packages in Python, but those packages I found do not allow me to label the map as the mission required, so I looked for more package and found CGView API one in Java, which helps me create a circular genome map with colors and labels. I am not a Java programmer so it took me a while to learn the syntax of Java briefly and then I implemented the CGView example code in Git. https://paulstothard.github.io/cgview/
I am still in the process of debugging and have not got to the image solution as required. I am still having problems with installing the package into Git Bash. However, this is how I think we should do to solve this question.

## Citation
CGView citation:
https://pubmed.ncbi.nlm.nih.gov/15479716/


https://github.com/paulstothard/cgview
