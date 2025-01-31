class Node(var data: Int) {
    var following: Node? = null

    fun appendToEnd(data: Int) {
        val end = Node(data)
        var n: Node? = this

        while (n!!.following != null) {
            n = n.following
        }
        n.following = end
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        var current: Node? = this
        while (current != null) {
            print("${current.data} ---> ")
            current = current.following
        }
        println("null")
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        var current = h
        var length: Int = 0

        while (current != null) {
            length++
            current = current.following
        }
        return length
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        var current: Node? = this
        var sum = 0
        while (current != null) {
            sum += current.data
            current = current.following
        }
        return sum
    }

    fun deleteNode(head: Node, data: Int): Node? {
        val current: Node = head
        if (current.data == data) {
            return current.following
        }

        // TODO:: Implement the proper loop in order to remove given data
        var iterator: Node? = current

        while (iterator?.following != null) {
            val nextNode = iterator.following
            if (nextNode?.data == data) {
                iterator.following = nextNode.following
                return current
            }
            iterator = nextNode
        }

        return current
    }
}