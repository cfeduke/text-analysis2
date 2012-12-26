package com.deploymentzone.textanalysis

import org.tartarus.snowball.ext.EnglishStemmer


class SnowballEnglishStemmer {
  def static void main(String[] args) {
    def stemmer = new EnglishStemmer();
    [
      "bank":"bank",
      "banks":"bank",
      "banking":"bank",
      "banker":"banker",
      "banked":"bank",
      "bankers":"banker"
      ].each {
        stemmer.setCurrent(it.key)
        stemmer.stem();
        println "Expecting: $it.value\t\tStemmed: ${stemmer.getCurrent()}\t\tFrom $it.key"
      }
  }
}
