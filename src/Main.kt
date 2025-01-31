object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        // Example
        val node = Node(4)
        node.appendToEnd(5)
        node.appendToEnd(6)
        node.appendToEnd(7)
        // End of Example

        printLinkedList(node)
        printDeleteNode(node, 6)
        lengthLinkedList(node)
        sumNodes(node)
    }

    private fun printLinkedList(node: Node) {
        println("Linked List:")
        node.printNodes()
    }

    private fun printDeleteNode(node: Node, data: Int) {
        println("Linked List Before Deletion:")
        node.printNodes()

        val updatedNode = node.deleteNode(node, 6)

        println("Linked List After Deletion:")
        updatedNode?.printNodes()
    }

    private fun lengthLinkedList(node: Node) {
        println("Linked List:")
        node.printNodes()

        println("Length of Linked List: ${node.length(node)}")
    }

    private fun sumNodes(node: Node) {
        println("Linked List:")
        node.printNodes()

        println("Sum of Nodes: ${node.sumOfNodes()}")
    }
}
