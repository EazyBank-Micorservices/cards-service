CREATE TABLE IF NOT EXISTS cards
(
    card_id          BIGINT       NOT NULL,
    created_at       datetime     NULL,
    created_by       VARCHAR(255) NULL,
    updated_at       datetime     NULL,
    updated_by       VARCHAR(255) NULL,
    mobile_number    VARCHAR(255) NULL,
    card_number      VARCHAR(255) NULL,
    card_type        VARCHAR(255) NULL,
    total_limit      INT          NOT NULL,
    amount_used      INT          NOT NULL,
    available_amount INT          NOT NULL,
    CONSTRAINT pk_cards PRIMARY KEY (card_id)
);