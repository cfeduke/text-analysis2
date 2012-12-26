package com.deploymentzone.textanalysis

import org.tartarus.snowball.ext.EnglishStemmer


class SnowballEnglishStemmer {
  def static void main(String[] args) {
    def stemmer = new EnglishStemmer();
    ["bank":"bank", ].each { kv -> println "$kv.key $kv.value" }
  }
}
