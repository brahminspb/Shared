// vars/const.groovy
class const implements Serializable {
    private String url
    def setUrl(value) {
        url = value
    }
    def getUrl() {
        url
    }
    def caution(message) {
        echo "Full url is http:, ${url}!"
    }
}