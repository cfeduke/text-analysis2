package com.deploymentzone.textanalysis

import opennlp.tools.postag.POSModel
import opennlp.tools.postag.POSTaggerME
import opennlp.tools.tokenize.SimpleTokenizer

class POSTagger {
  static def main(String[] args) {
    def is = POSTagger.class.getResourceAsStream("en-pos-maxent.bin")
    def model = new POSModel(is)
    def tagger = new POSTaggerME(model)
    is.close()
    def words = SimpleTokenizer.INSTANCE.tokenize("The quick brown fox jumped over the lazy dogs.")
    tagger.tag(words).eachWithIndex { result, i -> println "${words[i]}/${result}" }
  }

}
