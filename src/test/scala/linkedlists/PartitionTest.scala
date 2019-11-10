package linkedlists

import org.scalatest.{FlatSpec, Matchers}

class PartitionTest extends FlatSpec with Matchers {

  it should "partition list based on X" in {
    val n = new Node(3, new Node(5, new Node(8, new Node(5, new Node(10, new Node(2, new Node(1)))))))

    val partitioned = Partition.partition(n, 5);

    partitioned should be(new Node(1, new Node(2, new Node(3, new Node(5, new Node(8, new Node(5, new Node(10))))))))
  }
}