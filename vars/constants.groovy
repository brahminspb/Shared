// vars/constants.groovy
class constants implements Serializable {
    private String url
    def setUrl(value) {
        url = value
    }
    def getUrl() {
        url
    }
    def fullUrl(message) {
        echo "Full url is http:, ${url}!"
    }
}